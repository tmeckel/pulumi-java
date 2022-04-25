// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatasetTagsItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatasetTagsItemResponse Empty = new DatasetTagsItemResponse();

    /**
     * [Required] The namespaced friendly name of the tag key, e.g. &#34;12345/environment&#34; where 12345 is org id.
     * 
     */
    @Import(name="tagKey", required=true)
    private String tagKey;

    /**
     * @return [Required] The namespaced friendly name of the tag key, e.g. &#34;12345/environment&#34; where 12345 is org id.
     * 
     */
    public String tagKey() {
        return this.tagKey;
    }

    /**
     * [Required] Friendly short name of the tag value, e.g. &#34;production&#34;.
     * 
     */
    @Import(name="tagValue", required=true)
    private String tagValue;

    /**
     * @return [Required] Friendly short name of the tag value, e.g. &#34;production&#34;.
     * 
     */
    public String tagValue() {
        return this.tagValue;
    }

    private DatasetTagsItemResponse() {}

    private DatasetTagsItemResponse(DatasetTagsItemResponse $) {
        this.tagKey = $.tagKey;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetTagsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetTagsItemResponse $;

        public Builder() {
            $ = new DatasetTagsItemResponse();
        }

        public Builder(DatasetTagsItemResponse defaults) {
            $ = new DatasetTagsItemResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param tagKey [Required] The namespaced friendly name of the tag key, e.g. &#34;12345/environment&#34; where 12345 is org id.
         * 
         * @return builder
         * 
         */
        public Builder tagKey(String tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        /**
         * @param tagValue [Required] Friendly short name of the tag value, e.g. &#34;production&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tagValue(String tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        public DatasetTagsItemResponse build() {
            $.tagKey = Objects.requireNonNull($.tagKey, "expected parameter 'tagKey' to be non-null");
            $.tagValue = Objects.requireNonNull($.tagValue, "expected parameter 'tagValue' to be non-null");
            return $;
        }
    }

}
