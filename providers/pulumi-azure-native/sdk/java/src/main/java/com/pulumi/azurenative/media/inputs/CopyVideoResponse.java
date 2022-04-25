// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A codec flag, which tells the encoder to copy the input video bitstream without re-encoding.
 * 
 */
public final class CopyVideoResponse extends com.pulumi.resources.InvokeArgs {

    public static final CopyVideoResponse Empty = new CopyVideoResponse();

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @Import(name="label")
    private @Nullable String label;

    /**
     * @return An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.CopyVideo&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.CopyVideo&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    private CopyVideoResponse() {}

    private CopyVideoResponse(CopyVideoResponse $) {
        this.label = $.label;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CopyVideoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CopyVideoResponse $;

        public Builder() {
            $ = new CopyVideoResponse();
        }

        public Builder(CopyVideoResponse defaults) {
            $ = new CopyVideoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param label An optional label for the codec. The label can be used to control muxing behavior.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable String label) {
            $.label = label;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.CopyVideo&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        public CopyVideoResponse build() {
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            return $;
        }
    }

}
