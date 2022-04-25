// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the runbook parameter type.
 * 
 */
public final class RunbookParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final RunbookParameterArgs Empty = new RunbookParameterArgs();

    /**
     * Gets or sets the default value of parameter.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<String> defaultValue;

    /**
     * @return Gets or sets the default value of parameter.
     * 
     */
    public Optional<Output<String>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * Gets or sets a Boolean value to indicate whether the parameter is mandatory or not.
     * 
     */
    @Import(name="isMandatory")
    private @Nullable Output<Boolean> isMandatory;

    /**
     * @return Gets or sets a Boolean value to indicate whether the parameter is mandatory or not.
     * 
     */
    public Optional<Output<Boolean>> isMandatory() {
        return Optional.ofNullable(this.isMandatory);
    }

    /**
     * Get or sets the position of the parameter.
     * 
     */
    @Import(name="position")
    private @Nullable Output<Integer> position;

    /**
     * @return Get or sets the position of the parameter.
     * 
     */
    public Optional<Output<Integer>> position() {
        return Optional.ofNullable(this.position);
    }

    /**
     * Gets or sets the type of the parameter.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Gets or sets the type of the parameter.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private RunbookParameterArgs() {}

    private RunbookParameterArgs(RunbookParameterArgs $) {
        this.defaultValue = $.defaultValue;
        this.isMandatory = $.isMandatory;
        this.position = $.position;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RunbookParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RunbookParameterArgs $;

        public Builder() {
            $ = new RunbookParameterArgs();
        }

        public Builder(RunbookParameterArgs defaults) {
            $ = new RunbookParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultValue Gets or sets the default value of parameter.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        /**
         * @param defaultValue Gets or sets the default value of parameter.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(String defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        /**
         * @param isMandatory Gets or sets a Boolean value to indicate whether the parameter is mandatory or not.
         * 
         * @return builder
         * 
         */
        public Builder isMandatory(@Nullable Output<Boolean> isMandatory) {
            $.isMandatory = isMandatory;
            return this;
        }

        /**
         * @param isMandatory Gets or sets a Boolean value to indicate whether the parameter is mandatory or not.
         * 
         * @return builder
         * 
         */
        public Builder isMandatory(Boolean isMandatory) {
            return isMandatory(Output.of(isMandatory));
        }

        /**
         * @param position Get or sets the position of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder position(@Nullable Output<Integer> position) {
            $.position = position;
            return this;
        }

        /**
         * @param position Get or sets the position of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder position(Integer position) {
            return position(Output.of(position));
        }

        /**
         * @param type Gets or sets the type of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Gets or sets the type of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RunbookParameterArgs build() {
            return $;
        }
    }

}
