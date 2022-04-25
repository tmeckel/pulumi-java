// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotAssociationLexBotArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotAssociationLexBotArgs Empty = new BotAssociationLexBotArgs();

    /**
     * The Region that the Amazon Lex (V1) bot was created in. Defaults to current region.
     * 
     */
    @Import(name="lexRegion")
    private @Nullable Output<String> lexRegion;

    /**
     * @return The Region that the Amazon Lex (V1) bot was created in. Defaults to current region.
     * 
     */
    public Optional<Output<String>> lexRegion() {
        return Optional.ofNullable(this.lexRegion);
    }

    /**
     * The name of the Amazon Lex (V1) bot.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Amazon Lex (V1) bot.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private BotAssociationLexBotArgs() {}

    private BotAssociationLexBotArgs(BotAssociationLexBotArgs $) {
        this.lexRegion = $.lexRegion;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotAssociationLexBotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAssociationLexBotArgs $;

        public Builder() {
            $ = new BotAssociationLexBotArgs();
        }

        public Builder(BotAssociationLexBotArgs defaults) {
            $ = new BotAssociationLexBotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lexRegion The Region that the Amazon Lex (V1) bot was created in. Defaults to current region.
         * 
         * @return builder
         * 
         */
        public Builder lexRegion(@Nullable Output<String> lexRegion) {
            $.lexRegion = lexRegion;
            return this;
        }

        /**
         * @param lexRegion The Region that the Amazon Lex (V1) bot was created in. Defaults to current region.
         * 
         * @return builder
         * 
         */
        public Builder lexRegion(String lexRegion) {
            return lexRegion(Output.of(lexRegion));
        }

        /**
         * @param name The name of the Amazon Lex (V1) bot.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Amazon Lex (V1) bot.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public BotAssociationLexBotArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
