// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.emr.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStudioArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStudioArgs Empty = new GetStudioArgs();

    /**
     * The ID of the EMR Studio.
     * 
     */
    @Import(name="studioId", required=true)
    private String studioId;

    /**
     * @return The ID of the EMR Studio.
     * 
     */
    public String studioId() {
        return this.studioId;
    }

    private GetStudioArgs() {}

    private GetStudioArgs(GetStudioArgs $) {
        this.studioId = $.studioId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStudioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStudioArgs $;

        public Builder() {
            $ = new GetStudioArgs();
        }

        public Builder(GetStudioArgs defaults) {
            $ = new GetStudioArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param studioId The ID of the EMR Studio.
         * 
         * @return builder
         * 
         */
        public Builder studioId(String studioId) {
            $.studioId = studioId;
            return this;
        }

        public GetStudioArgs build() {
            $.studioId = Objects.requireNonNull($.studioId, "expected parameter 'studioId' to be non-null");
            return $;
        }
    }

}
