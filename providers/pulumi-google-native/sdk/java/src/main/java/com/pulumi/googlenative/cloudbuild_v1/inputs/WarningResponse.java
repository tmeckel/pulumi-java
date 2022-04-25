// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A non-fatal problem encountered during the execution of the build.
 * 
 */
public final class WarningResponse extends com.pulumi.resources.InvokeArgs {

    public static final WarningResponse Empty = new WarningResponse();

    /**
     * The priority for this warning.
     * 
     */
    @Import(name="priority", required=true)
    private String priority;

    /**
     * @return The priority for this warning.
     * 
     */
    public String priority() {
        return this.priority;
    }

    /**
     * Explanation of the warning generated.
     * 
     */
    @Import(name="text", required=true)
    private String text;

    /**
     * @return Explanation of the warning generated.
     * 
     */
    public String text() {
        return this.text;
    }

    private WarningResponse() {}

    private WarningResponse(WarningResponse $) {
        this.priority = $.priority;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WarningResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WarningResponse $;

        public Builder() {
            $ = new WarningResponse();
        }

        public Builder(WarningResponse defaults) {
            $ = new WarningResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param priority The priority for this warning.
         * 
         * @return builder
         * 
         */
        public Builder priority(String priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param text Explanation of the warning generated.
         * 
         * @return builder
         * 
         */
        public Builder text(String text) {
            $.text = text;
            return this;
        }

        public WarningResponse build() {
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            return $;
        }
    }

}
