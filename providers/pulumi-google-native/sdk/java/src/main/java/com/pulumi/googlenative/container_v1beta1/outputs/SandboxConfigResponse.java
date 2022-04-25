// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SandboxConfigResponse {
    /**
     * @return Type of the sandbox to use for the node (e.g. &#39;gvisor&#39;)
     * 
     */
    private final String sandboxType;
    /**
     * @return Type of the sandbox to use for the node.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SandboxConfigResponse(
        @CustomType.Parameter("sandboxType") String sandboxType,
        @CustomType.Parameter("type") String type) {
        this.sandboxType = sandboxType;
        this.type = type;
    }

    /**
     * @return Type of the sandbox to use for the node (e.g. &#39;gvisor&#39;)
     * 
     */
    public String sandboxType() {
        return this.sandboxType;
    }
    /**
     * @return Type of the sandbox to use for the node.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SandboxConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sandboxType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SandboxConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sandboxType = defaults.sandboxType;
    	      this.type = defaults.type;
        }

        public Builder sandboxType(String sandboxType) {
            this.sandboxType = Objects.requireNonNull(sandboxType);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SandboxConfigResponse build() {
            return new SandboxConfigResponse(sandboxType, type);
        }
    }
}
