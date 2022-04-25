// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFeatureGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFeatureGroupArgs Empty = new GetFeatureGroupArgs();

    /**
     * The Name of the FeatureGroup.
     * 
     */
    @Import(name="featureGroupName", required=true)
    private String featureGroupName;

    /**
     * @return The Name of the FeatureGroup.
     * 
     */
    public String featureGroupName() {
        return this.featureGroupName;
    }

    private GetFeatureGroupArgs() {}

    private GetFeatureGroupArgs(GetFeatureGroupArgs $) {
        this.featureGroupName = $.featureGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeatureGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeatureGroupArgs $;

        public Builder() {
            $ = new GetFeatureGroupArgs();
        }

        public Builder(GetFeatureGroupArgs defaults) {
            $ = new GetFeatureGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param featureGroupName The Name of the FeatureGroup.
         * 
         * @return builder
         * 
         */
        public Builder featureGroupName(String featureGroupName) {
            $.featureGroupName = featureGroupName;
            return this;
        }

        public GetFeatureGroupArgs build() {
            $.featureGroupName = Objects.requireNonNull($.featureGroupName, "expected parameter 'featureGroupName' to be non-null");
            return $;
        }
    }

}
