// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The TarGZip compression read settings.
 * 
 */
public final class TarGZipReadSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final TarGZipReadSettingsResponse Empty = new TarGZipReadSettingsResponse();

    /**
     * Preserve the compression file name as folder path. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="preserveCompressionFileNameAsFolder")
    private @Nullable Object preserveCompressionFileNameAsFolder;

    /**
     * @return Preserve the compression file name as folder path. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> preserveCompressionFileNameAsFolder() {
        return Optional.ofNullable(this.preserveCompressionFileNameAsFolder);
    }

    /**
     * The Compression setting type.
     * Expected value is &#39;TarGZipReadSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The Compression setting type.
     * Expected value is &#39;TarGZipReadSettings&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private TarGZipReadSettingsResponse() {}

    private TarGZipReadSettingsResponse(TarGZipReadSettingsResponse $) {
        this.preserveCompressionFileNameAsFolder = $.preserveCompressionFileNameAsFolder;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TarGZipReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TarGZipReadSettingsResponse $;

        public Builder() {
            $ = new TarGZipReadSettingsResponse();
        }

        public Builder(TarGZipReadSettingsResponse defaults) {
            $ = new TarGZipReadSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param preserveCompressionFileNameAsFolder Preserve the compression file name as folder path. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder preserveCompressionFileNameAsFolder(@Nullable Object preserveCompressionFileNameAsFolder) {
            $.preserveCompressionFileNameAsFolder = preserveCompressionFileNameAsFolder;
            return this;
        }

        /**
         * @param type The Compression setting type.
         * Expected value is &#39;TarGZipReadSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public TarGZipReadSettingsResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
