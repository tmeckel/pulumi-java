// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations {
    /**
     * Transformation for each infoType. Cannot specify more than one for a given infoType.
     * Structure is documented below.
     * 
     */
    private final List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation> transformations;

    @OutputCustomType.Constructor
    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations(@OutputCustomType.Parameter("transformations") List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation> transformations) {
        this.transformations = transformations;
    }

    /**
     * Transformation for each infoType. Cannot specify more than one for a given infoType.
     * Structure is documented below.
     * 
    */
    public List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation> getTransformations() {
        return this.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation> transformations;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformations = defaults.transformations;
        }

        public Builder transformations(List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation> transformations) {
            this.transformations = Objects.requireNonNull(transformations);
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations(transformations);
        }
    }
}
