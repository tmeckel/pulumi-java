// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetFleetLaunchTemplateSpecification extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetFleetLaunchTemplateSpecification Empty = new SpotFleetFleetLaunchTemplateSpecification();

    @InputImport(name="launchTemplateId")
      private final @Nullable String launchTemplateId;

    public Optional<String> getLaunchTemplateId() {
        return this.launchTemplateId == null ? Optional.empty() : Optional.ofNullable(this.launchTemplateId);
    }

    @InputImport(name="launchTemplateName")
      private final @Nullable String launchTemplateName;

    public Optional<String> getLaunchTemplateName() {
        return this.launchTemplateName == null ? Optional.empty() : Optional.ofNullable(this.launchTemplateName);
    }

    @InputImport(name="version", required=true)
      private final String version;

    public String getVersion() {
        return this.version;
    }

    public SpotFleetFleetLaunchTemplateSpecification(
        @Nullable String launchTemplateId,
        @Nullable String launchTemplateName,
        String version) {
        this.launchTemplateId = launchTemplateId;
        this.launchTemplateName = launchTemplateName;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private SpotFleetFleetLaunchTemplateSpecification() {
        this.launchTemplateId = null;
        this.launchTemplateName = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetFleetLaunchTemplateSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String launchTemplateId;
        private @Nullable String launchTemplateName;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetFleetLaunchTemplateSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.version = defaults.version;
        }

        public Builder launchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        public Builder launchTemplateName(@Nullable String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public SpotFleetFleetLaunchTemplateSpecification build() {
            return new SpotFleetFleetLaunchTemplateSpecification(launchTemplateId, launchTemplateName, version);
        }
    }
}
