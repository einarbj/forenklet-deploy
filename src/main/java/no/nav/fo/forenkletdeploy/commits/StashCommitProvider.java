package no.nav.fo.forenkletdeploy.commits;

import no.nav.fo.forenkletdeploy.domain.Commit;

import java.util.Arrays;
import java.util.List;

public class StashCommitProvider implements CommitProvider {
    private static Long getMinutesAgo(Integer minutes) {
        return (System.currentTimeMillis()) - (minutes * 60 * 1000);
    }

    @Override
    public List<Commit> getCommitsForRelease(String repo, String fromTag, String toTag) {
        return Arrays.asList(
                Commit.builder()
                        .hash("1402a360346aefd")
                        .application(repo)
                        .message("Merge pull-request #35 into master")
                        .author("Dummy the Cat")
                        .timestamp(getMinutesAgo(1))
                        .mergecommit(true)
                        .build(),

                Commit.builder()
                        .hash("feda134124cd323418")
                        .application(repo)
                        .message("PUS-27 Adding UU-definition file")
                        .author("Dummy the Cat")
                        .timestamp(getMinutesAgo(3))
                        .mergecommit(false)
                        .build(),

                Commit.builder()
                        .hash("98cdf452afcde")
                        .application(repo)
                        .message("PUS-11 Legger til en feature som er feature-togglet vekk")
                        .author("Dummy the Cat")
                        .timestamp(getMinutesAgo(12))
                        .mergecommit(false)
                        .build(),

                Commit.builder()
                        .hash("a6a7d6d4cs65f")
                        .application(repo)
                        .message("PUS-12 En dummybeskrivelse av en issue som jeg løste")
                        .author("Dummy the Cat")
                        .timestamp(getMinutesAgo(72))
                        .mergecommit(false)
                        .build(),

                Commit.builder()
                        .hash("425fdfa1341de2")
                        .application(repo)
                        .message("Refakturerer en feature som ikke hører til brukerhistorie")
                        .author("Dummy the Cat")
                        .timestamp(getMinutesAgo(60 * 24))
                        .mergecommit(false)
                        .build(),

                Commit.builder()
                        .hash("4325cfda24de3424d")
                        .application(repo)
                        .message("FO-123 Fikset en dummy-feature med lite testbehov")
                        .author("Dummy the Cat")
                        .timestamp(getMinutesAgo(60 * 24 * 3))
                        .mergecommit(false)
                        .build()
        );
    }
}
