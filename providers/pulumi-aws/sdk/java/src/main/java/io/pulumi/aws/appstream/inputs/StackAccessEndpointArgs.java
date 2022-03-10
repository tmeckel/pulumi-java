// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackAccessEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackAccessEndpointArgs Empty = new StackAccessEndpointArgs();

    @InputImport(name="endpointType", required=true)
      private final Input<String> endpointType;

    public Input<String> getEndpointType() {
        return this.endpointType;
    }

    @InputImport(name="vpceId")
      private final @Nullable Input<String> vpceId;

    public Input<String> getVpceId() {
        return this.vpceId == null ? Input.empty() : this.vpceId;
    }

    public StackAccessEndpointArgs(
        Input<String> endpointType,
        @Nullable Input<String> vpceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.vpceId = vpceId;
    }

    private StackAccessEndpointArgs() {
        this.endpointType = Input.empty();
        this.vpceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackAccessEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endpointType;
        private @Nullable Input<String> vpceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StackAccessEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.vpceId = defaults.vpceId;
        }

        public Builder endpointType(Input<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder endpointType(String endpointType) {
            this.endpointType = Input.of(Objects.requireNonNull(endpointType));
            return this;
        }

        public Builder vpceId(@Nullable Input<String> vpceId) {
            this.vpceId = vpceId;
            return this;
        }

        public Builder vpceId(@Nullable String vpceId) {
            this.vpceId = Input.ofNullable(vpceId);
            return this;
        }
        public StackAccessEndpointArgs build() {
            return new StackAccessEndpointArgs(endpointType, vpceId);
        }
    }
}
