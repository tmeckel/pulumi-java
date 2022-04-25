// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.inputs.ModeValueInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameter definition for a module asset.
 * 
 */
public final class ModuleAssetParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModuleAssetParameterArgs Empty = new ModuleAssetParameterArgs();

    /**
     * Definitions for nested interface parameters if this is a complex module parameter.
     * 
     */
    @Import(name="modeValuesInfo")
    private @Nullable Output<Map<String,ModeValueInfoArgs>> modeValuesInfo;

    /**
     * @return Definitions for nested interface parameters if this is a complex module parameter.
     * 
     */
    public Optional<Output<Map<String,ModeValueInfoArgs>>> modeValuesInfo() {
        return Optional.ofNullable(this.modeValuesInfo);
    }

    /**
     * Parameter name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Parameter name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Parameter type.
     * 
     */
    @Import(name="parameterType")
    private @Nullable Output<String> parameterType;

    /**
     * @return Parameter type.
     * 
     */
    public Optional<Output<String>> parameterType() {
        return Optional.ofNullable(this.parameterType);
    }

    private ModuleAssetParameterArgs() {}

    private ModuleAssetParameterArgs(ModuleAssetParameterArgs $) {
        this.modeValuesInfo = $.modeValuesInfo;
        this.name = $.name;
        this.parameterType = $.parameterType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModuleAssetParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModuleAssetParameterArgs $;

        public Builder() {
            $ = new ModuleAssetParameterArgs();
        }

        public Builder(ModuleAssetParameterArgs defaults) {
            $ = new ModuleAssetParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param modeValuesInfo Definitions for nested interface parameters if this is a complex module parameter.
         * 
         * @return builder
         * 
         */
        public Builder modeValuesInfo(@Nullable Output<Map<String,ModeValueInfoArgs>> modeValuesInfo) {
            $.modeValuesInfo = modeValuesInfo;
            return this;
        }

        /**
         * @param modeValuesInfo Definitions for nested interface parameters if this is a complex module parameter.
         * 
         * @return builder
         * 
         */
        public Builder modeValuesInfo(Map<String,ModeValueInfoArgs> modeValuesInfo) {
            return modeValuesInfo(Output.of(modeValuesInfo));
        }

        /**
         * @param name Parameter name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Parameter name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameterType Parameter type.
         * 
         * @return builder
         * 
         */
        public Builder parameterType(@Nullable Output<String> parameterType) {
            $.parameterType = parameterType;
            return this;
        }

        /**
         * @param parameterType Parameter type.
         * 
         * @return builder
         * 
         */
        public Builder parameterType(String parameterType) {
            return parameterType(Output.of(parameterType));
        }

        public ModuleAssetParameterArgs build() {
            return $;
        }
    }

}
