// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ResourceProviderManifestPropertiesResponseProviderAuthentication {
    private final List<String> allowedAudiences;

    @OutputCustomType.Constructor
    private ResourceProviderManifestPropertiesResponseProviderAuthentication(@OutputCustomType.Parameter("allowedAudiences") List<String> allowedAudiences) {
        this.allowedAudiences = allowedAudiences;
    }

    public List<String> getAllowedAudiences() {
        return this.allowedAudiences;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderManifestPropertiesResponseProviderAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedAudiences;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderManifestPropertiesResponseProviderAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
        }

        public Builder allowedAudiences(List<String> allowedAudiences) {
            this.allowedAudiences = Objects.requireNonNull(allowedAudiences);
            return this;
        }
        public ResourceProviderManifestPropertiesResponseProviderAuthentication build() {
            return new ResourceProviderManifestPropertiesResponseProviderAuthentication(allowedAudiences);
        }
    }
}
