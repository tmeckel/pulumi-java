// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceAttachmentState Empty = new InstanceAttachmentState();

    /**
     * The resource ID of the environment.
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<String> environment;

    public Output<String> getEnvironment() {
        return this.environment == null ? Codegen.empty() : this.environment;
    }

    /**
     * The Apigee instance associated with the Apigee environment,
     * in the format `organisations/{{org_name}}/instances/{{instance_name}}`.
     * 
     */
    @Import(name="instanceId")
      private final @Nullable Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId == null ? Codegen.empty() : this.instanceId;
    }

    /**
     * The name of the newly created attachment (output parameter).
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public InstanceAttachmentState(
        @Nullable Output<String> environment,
        @Nullable Output<String> instanceId,
        @Nullable Output<String> name) {
        this.environment = environment;
        this.instanceId = instanceId;
        this.name = name;
    }

    private InstanceAttachmentState() {
        this.environment = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> environment;
        private @Nullable Output<String> instanceId;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
        }

        public Builder environment(@Nullable Output<String> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable String environment) {
            this.environment = Codegen.ofNullable(environment);
            return this;
        }
        public Builder instanceId(@Nullable Output<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Codegen.ofNullable(instanceId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public InstanceAttachmentState build() {
            return new InstanceAttachmentState(environment, instanceId, name);
        }
    }
}
