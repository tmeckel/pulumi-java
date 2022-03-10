// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoType;
import io.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformation;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation {
    /**
     * InfoTypes to apply the transformation to. Leaving this empty will apply the transformation to apply to
     * all findings that correspond to infoTypes that were requested in InspectConfig.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoType> infoTypes;
    /**
     * Primitive transformation to apply to the infoType.
     * Structure is documented below.
     * 
     */
    private final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformation primitiveTransformation;

    @OutputCustomType.Constructor
    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation(
        @OutputCustomType.Parameter("infoTypes") @Nullable List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoType> infoTypes,
        @OutputCustomType.Parameter("primitiveTransformation") PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformation primitiveTransformation) {
        this.infoTypes = infoTypes;
        this.primitiveTransformation = primitiveTransformation;
    }

    /**
     * InfoTypes to apply the transformation to. Leaving this empty will apply the transformation to apply to
     * all findings that correspond to infoTypes that were requested in InspectConfig.
     * Structure is documented below.
     * 
    */
    public List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoType> getInfoTypes() {
        return this.infoTypes == null ? List.of() : this.infoTypes;
    }
    /**
     * Primitive transformation to apply to the infoType.
     * Structure is documented below.
     * 
    */
    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformation getPrimitiveTransformation() {
        return this.primitiveTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoType> infoTypes;
        private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformation primitiveTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.primitiveTransformation = defaults.primitiveTransformation;
        }

        public Builder infoTypes(@Nullable List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoType> infoTypes) {
            this.infoTypes = infoTypes;
            return this;
        }

        public Builder primitiveTransformation(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformation primitiveTransformation) {
            this.primitiveTransformation = Objects.requireNonNull(primitiveTransformation);
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation(infoTypes, primitiveTransformation);
        }
    }
}
