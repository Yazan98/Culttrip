package com.yazan98.destiny.server.data.repository

import com.yazan98.destiny.server.data.entity.main.route.Route
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created By : Yazan Tarifi
 * Date : 12/30/2019
 * Time : 5:37 PM
 */

@Repository
interface RouteRepository : JpaRepository<Route, Long> {
}
