// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * FlowDistinguisherMethod specifies the method of a flow distinguisher.
 * 
 */
public final class FlowDistinguisherMethodArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowDistinguisherMethodArgs Empty = new FlowDistinguisherMethodArgs();

    /**
     * `type` is the type of flow distinguisher method The supported types are "ByUser" and "ByNamespace". Required.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public FlowDistinguisherMethodArgs(Output<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FlowDistinguisherMethodArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDistinguisherMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDistinguisherMethodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public FlowDistinguisherMethodArgs build() {
            return new FlowDistinguisherMethodArgs(type);
        }
    }
}
