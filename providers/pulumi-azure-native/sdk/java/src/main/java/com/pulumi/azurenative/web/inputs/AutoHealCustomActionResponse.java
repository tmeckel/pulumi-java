// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom action to be executed
 * when an auto heal rule is triggered.
 * 
 */
public final class AutoHealCustomActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoHealCustomActionResponse Empty = new AutoHealCustomActionResponse();

    /**
     * Executable to be run.
     * 
     */
    @Import(name="exe")
    private @Nullable String exe;

    /**
     * @return Executable to be run.
     * 
     */
    public Optional<String> exe() {
        return Optional.ofNullable(this.exe);
    }

    /**
     * Parameters for the executable.
     * 
     */
    @Import(name="parameters")
    private @Nullable String parameters;

    /**
     * @return Parameters for the executable.
     * 
     */
    public Optional<String> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private AutoHealCustomActionResponse() {}

    private AutoHealCustomActionResponse(AutoHealCustomActionResponse $) {
        this.exe = $.exe;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoHealCustomActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoHealCustomActionResponse $;

        public Builder() {
            $ = new AutoHealCustomActionResponse();
        }

        public Builder(AutoHealCustomActionResponse defaults) {
            $ = new AutoHealCustomActionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param exe Executable to be run.
         * 
         * @return builder
         * 
         */
        public Builder exe(@Nullable String exe) {
            $.exe = exe;
            return this;
        }

        /**
         * @param parameters Parameters for the executable.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable String parameters) {
            $.parameters = parameters;
            return this;
        }

        public AutoHealCustomActionResponse build() {
            return $;
        }
    }

}
