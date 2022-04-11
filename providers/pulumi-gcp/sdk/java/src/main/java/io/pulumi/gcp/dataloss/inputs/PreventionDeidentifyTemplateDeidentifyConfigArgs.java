// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs;
import java.util.Objects;


public final class PreventionDeidentifyTemplateDeidentifyConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigArgs();

    /**
     * Specifies free-text based transformations to be applied to the dataset.
     * Structure is documented below.
     * 
     */
    @Import(name="infoTypeTransformations", required=true)
      private final Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs> infoTypeTransformations;

    public Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs> getInfoTypeTransformations() {
        return this.infoTypeTransformations;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigArgs(Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs> infoTypeTransformations) {
        this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations, "expected parameter 'infoTypeTransformations' to be non-null");
    }

    private PreventionDeidentifyTemplateDeidentifyConfigArgs() {
        this.infoTypeTransformations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs> infoTypeTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypeTransformations = defaults.infoTypeTransformations;
        }

        public Builder infoTypeTransformations(Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs> infoTypeTransformations) {
            this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations);
            return this;
        }
        public Builder infoTypeTransformations(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsArgs infoTypeTransformations) {
            this.infoTypeTransformations = Output.of(Objects.requireNonNull(infoTypeTransformations));
            return this;
        }        public PreventionDeidentifyTemplateDeidentifyConfigArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigArgs(infoTypeTransformations);
        }
    }
}
