package no.nav.fo.forenkletdeploy.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class FeatureToggle {
    private String name;
    private boolean enabled;
}