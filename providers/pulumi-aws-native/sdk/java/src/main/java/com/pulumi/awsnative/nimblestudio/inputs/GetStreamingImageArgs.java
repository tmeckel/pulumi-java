// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStreamingImageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamingImageArgs Empty = new GetStreamingImageArgs();

    @Import(name="streamingImageId", required=true)
    private String streamingImageId;

    public String streamingImageId() {
        return this.streamingImageId;
    }

    /**
     * &lt;p&gt;The studioId. &lt;/p&gt;
     * 
     */
    @Import(name="studioId", required=true)
    private String studioId;

    /**
     * @return &lt;p&gt;The studioId. &lt;/p&gt;
     * 
     */
    public String studioId() {
        return this.studioId;
    }

    private GetStreamingImageArgs() {}

    private GetStreamingImageArgs(GetStreamingImageArgs $) {
        this.streamingImageId = $.streamingImageId;
        this.studioId = $.studioId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamingImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamingImageArgs $;

        public Builder() {
            $ = new GetStreamingImageArgs();
        }

        public Builder(GetStreamingImageArgs defaults) {
            $ = new GetStreamingImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder streamingImageId(String streamingImageId) {
            $.streamingImageId = streamingImageId;
            return this;
        }

        /**
         * @param studioId &lt;p&gt;The studioId. &lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder studioId(String studioId) {
            $.studioId = studioId;
            return this;
        }

        public GetStreamingImageArgs build() {
            $.streamingImageId = Objects.requireNonNull($.streamingImageId, "expected parameter 'streamingImageId' to be non-null");
            $.studioId = Objects.requireNonNull($.studioId, "expected parameter 'studioId' to be non-null");
            return $;
        }
    }

}
