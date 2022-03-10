// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs Empty = new VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs();

    /**
     * The values sent must match the specified values exactly.
     * 
     */
    @InputImport(name="exacts", required=true)
      private final Input<List<String>> exacts;

    public Input<List<String>> getExacts() {
        return this.exacts;
    }

    public VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs(Input<List<String>> exacts) {
        this.exacts = Objects.requireNonNull(exacts, "expected parameter 'exacts' to be non-null");
    }

    private VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs() {
        this.exacts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> exacts;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exacts = defaults.exacts;
        }

        public Builder exacts(Input<List<String>> exacts) {
            this.exacts = Objects.requireNonNull(exacts);
            return this;
        }

        public Builder exacts(List<String> exacts) {
            this.exacts = Input.of(Objects.requireNonNull(exacts));
            return this;
        }
        public VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs build() {
            return new VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchArgs(exacts);
        }
    }
}
