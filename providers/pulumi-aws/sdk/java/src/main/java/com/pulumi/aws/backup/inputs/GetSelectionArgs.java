// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSelectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSelectionArgs Empty = new GetSelectionArgs();

    /**
     * The backup plan ID associated with the selection of resources.
     * 
     */
    @Import(name="planId", required=true)
    private String planId;

    /**
     * @return The backup plan ID associated with the selection of resources.
     * 
     */
    public String planId() {
        return this.planId;
    }

    /**
     * The backup selection ID.
     * 
     */
    @Import(name="selectionId", required=true)
    private String selectionId;

    /**
     * @return The backup selection ID.
     * 
     */
    public String selectionId() {
        return this.selectionId;
    }

    private GetSelectionArgs() {}

    private GetSelectionArgs(GetSelectionArgs $) {
        this.planId = $.planId;
        this.selectionId = $.selectionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSelectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSelectionArgs $;

        public Builder() {
            $ = new GetSelectionArgs();
        }

        public Builder(GetSelectionArgs defaults) {
            $ = new GetSelectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param planId The backup plan ID associated with the selection of resources.
         * 
         * @return builder
         * 
         */
        public Builder planId(String planId) {
            $.planId = planId;
            return this;
        }

        /**
         * @param selectionId The backup selection ID.
         * 
         * @return builder
         * 
         */
        public Builder selectionId(String selectionId) {
            $.selectionId = selectionId;
            return this;
        }

        public GetSelectionArgs build() {
            $.planId = Objects.requireNonNull($.planId, "expected parameter 'planId' to be non-null");
            $.selectionId = Objects.requireNonNull($.selectionId, "expected parameter 'selectionId' to be non-null");
            return $;
        }
    }

}
