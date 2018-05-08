package no.nav.fo.forenkletdeploy.service

import no.nav.fo.forenkletdeploy.VeraDeploy
import no.nav.fo.forenkletdeploy.consumer.getVeraConsumer
import org.springframework.stereotype.Service
import java.util.*
import javax.inject.Inject

@Service
class VeraDeployService @Inject
constructor(
        val teamService: TeamService
) {
    val veraConsumer = getVeraConsumer()
    private val gyldigeMiljoer = Arrays.asList("p", "q0", "q6", "t6")

    fun getDeploysForTeam(teamId: String): List<VeraDeploy> =
            teamService.getTeam(teamId).getApplicationConfigs()
                    .flatMap { getDeploysForApp(it.name) }

    fun getDeploysForApp(app: String): List<VeraDeploy> =
            veraConsumer.getDeploysForApp(app)
                    .filter { gyldigeMiljoer.contains(it.environment) }
}
