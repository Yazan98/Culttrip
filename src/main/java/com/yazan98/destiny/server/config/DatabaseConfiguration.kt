package com.yazan98.destiny.server.config

import com.yazan98.destiny.server.data.entity.category.Category
import com.yazan98.destiny.server.data.entity.main.Collection
import com.yazan98.destiny.server.data.entity.user.Profile
import com.yazan98.destiny.server.data.repository.CategoryRepository
import com.yazan98.destiny.server.data.repository.CollectionRepository
import com.yazan98.destiny.server.data.repository.ProfileRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@Configuration
open class DatabaseConfiguration @Autowired constructor(
        userRepository: ProfileRepository,
        collectionRepository: CollectionRepository,
        categoryRepository: CategoryRepository
) {

    init {
        userRepository.save(Profile(
                "Yazan Tarifi",
                BCryptPasswordEncoder().encode("123456789"),
                "yazan@gmail.com",
                "ACTIVATED",
                true,
                "image-url",
                "123456789"
        ))

        collectionRepository.save(Collection(
                "https://firebasestorage.googleapis.com/v0/b/culttrip-7da07.appspot.com/o/images%2Flouvre-inside-big.jpg?alt=media&token=a6d00154-730d-4dc7-b359-7c5bc406c364",
                "Ancure History Guide",
                15,
                "NORMAL"
        ))

        collectionRepository.save(Collection(
                "https://firebasestorage.googleapis.com/v0/b/culttrip-7da07.appspot.com/o/images%2Fwp1921783.jpg?alt=media&token=d038fd0d-72ea-457e-975d-2a5b3e0195c3",
                "Wonders of the World",
                20,
                "POPULAR"
        ))

        collectionRepository.save(Collection(
                "https://firebasestorage.googleapis.com/v0/b/culttrip-7da07.appspot.com/o/images%2Fwp1921788.jpg?alt=media&token=e8e182da-0598-4aac-8363-b45b83adc0e9",
                "Eiffel Tower - Paris",
                10,
                "POPULAR"
        ))

        collectionRepository.save(Collection(
                "https://firebasestorage.googleapis.com/v0/b/culttrip-7da07.appspot.com/o/images%2F118ac950-6b72-492c-e8b4-9d30c5114361.jfif?alt=media&token=ba408362-a0ba-489a-bf98-bd090b720ea4",
                "The Ultimate History Guide",
                0,
                "POPULAR"
        ))

        collectionRepository.save(Collection(
                "https://firebasestorage.googleapis.com/v0/b/culttrip-7da07.appspot.com/o/images%2FTaj_Mahal_Wonders_of_the_World_in_Agra_India_HD_Wallpapers.jpg?alt=media&token=7cd4dbfc-e6b6-4c6c-8496-4dfeee144cec",
                "Taj Mahal - India",
                3,
                "NORMAL"
        ))

        categoryRepository.save(Category(
                "Museums",
                "https://firebasestorage.googleapis.com/v0/b/culttrip-7da07.appspot.com/o/icons%2Fmuseum%20(1).png?alt=media&token=434e63ee-d08b-4cf9-b0f5-d078c36efa75"
        ))

        categoryRepository.save(Category(
                "Galleries",
                "https://firebasestorage.googleapis.com/v0/b/culttrip-7da07.appspot.com/o/icons%2Fphoto%20(1).png?alt=media&token=9ea8b10b-a128-450b-8837-486c9e9fc55c"
        ))

        categoryRepository.save(Category(
                "Sights",
                "https://firebasestorage.googleapis.com/v0/b/culttrip-7da07.appspot.com/o/icons%2Fcomplex%20(1).png?alt=media&token=49630a07-27c8-4550-b97a-eecbac56d561"
        ))

        categoryRepository.save(Category(
                "History Figures",
                "https://firebasestorage.googleapis.com/v0/b/culttrip-7da07.appspot.com/o/icons%2Fcoliseum%20(1).png?alt=media&token=c72f6286-bec8-4c8a-af86-58f5138978d0"
        ))

        categoryRepository.save(Category(
                "Art Movements",
                "https://firebasestorage.googleapis.com/v0/b/culttrip-7da07.appspot.com/o/icons%2Fmovement%20(1).png?alt=media&token=2f581e8d-0c5d-4e04-af6f-0c5ddaac5744"
        ))

        categoryRepository.save(Category(
                "Artists",
                "https://firebasestorage.googleapis.com/v0/b/culttrip-7da07.appspot.com/o/icons%2Fpaint%20(1).png?alt=media&token=d7fe2896-294b-425f-b812-d09a4ec9d259"
        ))

        categoryRepository.save(Category(
                "Places",
                "https://firebasestorage.googleapis.com/v0/b/culttrip-7da07.appspot.com/o/icons%2Fplace%20(1).png?alt=media&token=c2b4d770-e3ff-4980-8432-7f13ae53d962"
        ))

    }

}