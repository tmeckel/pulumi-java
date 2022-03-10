// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvGroupAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final EnvGroupAttachmentState Empty = new EnvGroupAttachmentState();

    /**
     * The Apigee environment group associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/envgroups/{{envgroup_name}}`.
     * 
     */
    @InputImport(name="envgroupId")
      private final @Nullable Input<String> envgroupId;

    public Input<String> getEnvgroupId() {
        return this.envgroupId == null ? Input.empty() : this.envgroupId;
    }

    /**
     * The resource ID of the environment.
     * 
     */
    @InputImport(name="environment")
      private final @Nullable Input<String> environment;

    public Input<String> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    /**
     * The name of the newly created attachment (output parameter).
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public EnvGroupAttachmentState(
        @Nullable Input<String> envgroupId,
        @Nullable Input<String> environment,
        @Nullable Input<String> name) {
        this.envgroupId = envgroupId;
        this.environment = environment;
        this.name = name;
    }

    private EnvGroupAttachmentState() {
        this.envgroupId = Input.empty();
        this.environment = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvGroupAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> envgroupId;
        private @Nullable Input<String> environment;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvGroupAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envgroupId = defaults.envgroupId;
    	      this.environment = defaults.environment;
    	      this.name = defaults.name;
        }

        public Builder envgroupId(@Nullable Input<String> envgroupId) {
            this.envgroupId = envgroupId;
            return this;
        }

        public Builder envgroupId(@Nullable String envgroupId) {
            this.envgroupId = Input.ofNullable(envgroupId);
            return this;
        }

        public Builder environment(@Nullable Input<String> environment) {
            this.environment = environment;
            return this;
        }

        public Builder environment(@Nullable String environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public EnvGroupAttachmentState build() {
            return new EnvGroupAttachmentState(envgroupId, environment, name);
        }
    }
}
