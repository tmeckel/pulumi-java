// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoUserSpecificationResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoUserSpecificationResponse Empty = new AutoUserSpecificationResponse();

    /**
     * The default value is nonAdmin.
     * 
     */
    @Import(name="elevationLevel")
    private @Nullable String elevationLevel;

    /**
     * @return The default value is nonAdmin.
     * 
     */
    public Optional<String> elevationLevel() {
        return Optional.ofNullable(this.elevationLevel);
    }

    /**
     * The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks but should be accessible by start tasks.
     * 
     */
    @Import(name="scope")
    private @Nullable String scope;

    /**
     * @return The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks but should be accessible by start tasks.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }

    private AutoUserSpecificationResponse() {}

    private AutoUserSpecificationResponse(AutoUserSpecificationResponse $) {
        this.elevationLevel = $.elevationLevel;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoUserSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoUserSpecificationResponse $;

        public Builder() {
            $ = new AutoUserSpecificationResponse();
        }

        public Builder(AutoUserSpecificationResponse defaults) {
            $ = new AutoUserSpecificationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param elevationLevel The default value is nonAdmin.
         * 
         * @return builder
         * 
         */
        public Builder elevationLevel(@Nullable String elevationLevel) {
            $.elevationLevel = elevationLevel;
            return this;
        }

        /**
         * @param scope The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks but should be accessible by start tasks.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable String scope) {
            $.scope = scope;
            return this;
        }

        public AutoUserSpecificationResponse build() {
            return $;
        }
    }

}
