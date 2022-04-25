// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery_v2.inputs.DatasetReferenceResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DatasetAccessEntryResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatasetAccessEntryResponse Empty = new DatasetAccessEntryResponse();

    /**
     * [Required] The dataset this entry applies to.
     * 
     */
    @Import(name="dataset", required=true)
    private DatasetReferenceResponse dataset;

    /**
     * @return [Required] The dataset this entry applies to.
     * 
     */
    public DatasetReferenceResponse dataset() {
        return this.dataset;
    }

    @Import(name="targetTypes", required=true)
    private List<String> targetTypes;

    public List<String> targetTypes() {
        return this.targetTypes;
    }

    private DatasetAccessEntryResponse() {}

    private DatasetAccessEntryResponse(DatasetAccessEntryResponse $) {
        this.dataset = $.dataset;
        this.targetTypes = $.targetTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetAccessEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetAccessEntryResponse $;

        public Builder() {
            $ = new DatasetAccessEntryResponse();
        }

        public Builder(DatasetAccessEntryResponse defaults) {
            $ = new DatasetAccessEntryResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataset [Required] The dataset this entry applies to.
         * 
         * @return builder
         * 
         */
        public Builder dataset(DatasetReferenceResponse dataset) {
            $.dataset = dataset;
            return this;
        }

        public Builder targetTypes(List<String> targetTypes) {
            $.targetTypes = targetTypes;
            return this;
        }

        public Builder targetTypes(String... targetTypes) {
            return targetTypes(List.of(targetTypes));
        }

        public DatasetAccessEntryResponse build() {
            $.dataset = Objects.requireNonNull($.dataset, "expected parameter 'dataset' to be non-null");
            $.targetTypes = Objects.requireNonNull($.targetTypes, "expected parameter 'targetTypes' to be non-null");
            return $;
        }
    }

}
