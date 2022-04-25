// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.advisor.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSuppressionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSuppressionArgs Empty = new GetSuppressionArgs();

    /**
     * The name of the suppression.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the suppression.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The recommendation ID.
     * 
     */
    @Import(name="recommendationId", required=true)
    private String recommendationId;

    /**
     * @return The recommendation ID.
     * 
     */
    public String recommendationId() {
        return this.recommendationId;
    }

    /**
     * The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * 
     */
    @Import(name="resourceUri", required=true)
    private String resourceUri;

    /**
     * @return The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
     * 
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    private GetSuppressionArgs() {}

    private GetSuppressionArgs(GetSuppressionArgs $) {
        this.name = $.name;
        this.recommendationId = $.recommendationId;
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSuppressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSuppressionArgs $;

        public Builder() {
            $ = new GetSuppressionArgs();
        }

        public Builder(GetSuppressionArgs defaults) {
            $ = new GetSuppressionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the suppression.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param recommendationId The recommendation ID.
         * 
         * @return builder
         * 
         */
        public Builder recommendationId(String recommendationId) {
            $.recommendationId = recommendationId;
            return this;
        }

        /**
         * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the recommendation applies.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        public GetSuppressionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.recommendationId = Objects.requireNonNull($.recommendationId, "expected parameter 'recommendationId' to be non-null");
            $.resourceUri = Objects.requireNonNull($.resourceUri, "expected parameter 'resourceUri' to be non-null");
            return $;
        }
    }

}
