// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the gallery unique name.
 * 
 */
public final class GalleryIdentifierResponse extends com.pulumi.resources.InvokeArgs {

    public static final GalleryIdentifierResponse Empty = new GalleryIdentifierResponse();

    /**
     * The unique name of the Shared Image Gallery. This name is generated automatically by Azure.
     * 
     */
    @Import(name="uniqueName", required=true)
    private String uniqueName;

    /**
     * @return The unique name of the Shared Image Gallery. This name is generated automatically by Azure.
     * 
     */
    public String uniqueName() {
        return this.uniqueName;
    }

    private GalleryIdentifierResponse() {}

    private GalleryIdentifierResponse(GalleryIdentifierResponse $) {
        this.uniqueName = $.uniqueName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GalleryIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GalleryIdentifierResponse $;

        public Builder() {
            $ = new GalleryIdentifierResponse();
        }

        public Builder(GalleryIdentifierResponse defaults) {
            $ = new GalleryIdentifierResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param uniqueName The unique name of the Shared Image Gallery. This name is generated automatically by Azure.
         * 
         * @return builder
         * 
         */
        public Builder uniqueName(String uniqueName) {
            $.uniqueName = uniqueName;
            return this;
        }

        public GalleryIdentifierResponse build() {
            $.uniqueName = Objects.requireNonNull($.uniqueName, "expected parameter 'uniqueName' to be non-null");
            return $;
        }
    }

}
