// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.azurenative.portal.enums.FontSize;
import com.pulumi.azurenative.portal.enums.FontStyle;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for terminal appearance.
 * 
 */
public final class TerminalSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TerminalSettingsArgs Empty = new TerminalSettingsArgs();

    /**
     * Size of terminal font.
     * 
     */
    @Import(name="fontSize")
    private @Nullable Output<Either<String,FontSize>> fontSize;

    /**
     * @return Size of terminal font.
     * 
     */
    public Optional<Output<Either<String,FontSize>>> fontSize() {
        return Optional.ofNullable(this.fontSize);
    }

    /**
     * Style of terminal font.
     * 
     */
    @Import(name="fontStyle")
    private @Nullable Output<Either<String,FontStyle>> fontStyle;

    /**
     * @return Style of terminal font.
     * 
     */
    public Optional<Output<Either<String,FontStyle>>> fontStyle() {
        return Optional.ofNullable(this.fontStyle);
    }

    private TerminalSettingsArgs() {}

    private TerminalSettingsArgs(TerminalSettingsArgs $) {
        this.fontSize = $.fontSize;
        this.fontStyle = $.fontStyle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TerminalSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TerminalSettingsArgs $;

        public Builder() {
            $ = new TerminalSettingsArgs();
        }

        public Builder(TerminalSettingsArgs defaults) {
            $ = new TerminalSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fontSize Size of terminal font.
         * 
         * @return builder
         * 
         */
        public Builder fontSize(@Nullable Output<Either<String,FontSize>> fontSize) {
            $.fontSize = fontSize;
            return this;
        }

        /**
         * @param fontSize Size of terminal font.
         * 
         * @return builder
         * 
         */
        public Builder fontSize(Either<String,FontSize> fontSize) {
            return fontSize(Output.of(fontSize));
        }

        /**
         * @param fontSize Size of terminal font.
         * 
         * @return builder
         * 
         */
        public Builder fontSize(String fontSize) {
            return fontSize(Either.ofLeft(fontSize));
        }

        /**
         * @param fontSize Size of terminal font.
         * 
         * @return builder
         * 
         */
        public Builder fontSize(FontSize fontSize) {
            return fontSize(Either.ofRight(fontSize));
        }

        /**
         * @param fontStyle Style of terminal font.
         * 
         * @return builder
         * 
         */
        public Builder fontStyle(@Nullable Output<Either<String,FontStyle>> fontStyle) {
            $.fontStyle = fontStyle;
            return this;
        }

        /**
         * @param fontStyle Style of terminal font.
         * 
         * @return builder
         * 
         */
        public Builder fontStyle(Either<String,FontStyle> fontStyle) {
            return fontStyle(Output.of(fontStyle));
        }

        /**
         * @param fontStyle Style of terminal font.
         * 
         * @return builder
         * 
         */
        public Builder fontStyle(String fontStyle) {
            return fontStyle(Either.ofLeft(fontStyle));
        }

        /**
         * @param fontStyle Style of terminal font.
         * 
         * @return builder
         * 
         */
        public Builder fontStyle(FontStyle fontStyle) {
            return fontStyle(Either.ofRight(fontStyle));
        }

        public TerminalSettingsArgs build() {
            return $;
        }
    }

}
