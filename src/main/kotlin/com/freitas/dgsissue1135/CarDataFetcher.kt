package com.freitas.dgsissue1135

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import java.util.*

@DgsComponent
class CarDataFetcher {

    private companion object {
        private val random = Random()
        val cars = listOf(
            Car("Golf", random.nextInt()),
            Car("Passat", random.nextInt()),
            Car("Delrey", random.nextInt())
        )
    }

    @DgsQuery
    fun cars() = cars

}