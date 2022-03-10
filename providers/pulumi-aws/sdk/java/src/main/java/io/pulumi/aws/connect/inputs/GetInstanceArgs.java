// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceArgs Empty = new GetInstanceArgs();

    /**
     * Returns information on a specific connect instance by alias
     * 
     */
    @InputImport(name="instanceAlias")
      private final @Nullable String instanceAlias;

    public Optional<String> getInstanceAlias() {
        return this.instanceAlias == null ? Optional.empty() : Optional.ofNullable(this.instanceAlias);
    }

    /**
     * Returns information on a specific connect instance by id
     * 
     */
    @InputImport(name="instanceId")
      private final @Nullable String instanceId;

    public Optional<String> getInstanceId() {
        return this.instanceId == null ? Optional.empty() : Optional.ofNullable(this.instanceId);
    }

    public GetInstanceArgs(
        @Nullable String instanceAlias,
        @Nullable String instanceId) {
        this.instanceAlias = instanceAlias;
        this.instanceId = instanceId;
    }

    private GetInstanceArgs() {
        this.instanceAlias = null;
        this.instanceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instanceAlias;
        private @Nullable String instanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceAlias = defaults.instanceAlias;
    	      this.instanceId = defaults.instanceId;
        }

        public Builder instanceAlias(@Nullable String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }

        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public GetInstanceArgs build() {
            return new GetInstanceArgs(instanceAlias, instanceId);
        }
    }
}
