package com.yazan98.destiny.server.controller

import com.yazan98.destiny.server.config.TokenProvider
import com.yazan98.destiny.server.data.entity.user.Profile
import com.yazan98.destiny.server.data.repository.ProfileRepository
import com.yazan98.destiny.server.service.ProfileService
import io.vortex.spring.boot.base.models.TokenInformation
import io.vortex.spring.boot.base.response.VortexResponse
import io.vortex.spring.boot.base.response.VortexSuccessResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * Created By : Yazan Tarifi
 * Date : 12/30/2019
 * Time : 3:41 AM
 */

@CrossOrigin
@RestController
@RequestMapping("v1/accounts")
class AuthController @Autowired constructor(service: ProfileService)
    : VortexMysqlController<Profile, Long, ProfileRepository, ProfileService>(service) {

    @ResponseBody
    @RequestMapping(value = ["/register"] , method = [RequestMethod.POST])
    override fun save(@Valid @RequestBody content: Profile?): ResponseEntity<VortexResponse> {
        return ResponseEntity.ok(VortexSuccessResponse(
                HttpStatus.CREATED.value(),
                "Account Created",
                "Success",
                content?.let { getService().createNewAccount(it) }
        ))
    }

    @ResponseBody
    @GetMapping(value = ["/" , "/all"], path = ["/" , "/all"])
    override fun getAll(): ResponseEntity<VortexResponse> {
        return super.getAll()
    }

}
