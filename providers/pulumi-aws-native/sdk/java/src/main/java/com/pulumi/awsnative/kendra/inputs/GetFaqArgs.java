// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFaqArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFaqArgs Empty = new GetFaqArgs();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * Index ID
     * 
     */
    @Import(name="indexId", required=true)
    private String indexId;

    /**
     * @return Index ID
     * 
     */
    public String indexId() {
        return this.indexId;
    }

    private GetFaqArgs() {}

    private GetFaqArgs(GetFaqArgs $) {
        this.id = $.id;
        this.indexId = $.indexId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFaqArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFaqArgs $;

        public Builder() {
            $ = new GetFaqArgs();
        }

        public Builder(GetFaqArgs defaults) {
            $ = new GetFaqArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param indexId Index ID
         * 
         * @return builder
         * 
         */
        public Builder indexId(String indexId) {
            $.indexId = indexId;
            return this;
        }

        public GetFaqArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.indexId = Objects.requireNonNull($.indexId, "expected parameter 'indexId' to be non-null");
            return $;
        }
    }

}
