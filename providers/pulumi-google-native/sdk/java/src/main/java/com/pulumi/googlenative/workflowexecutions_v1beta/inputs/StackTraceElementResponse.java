// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflowexecutions_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.workflowexecutions_v1beta.inputs.PositionResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A single stack element (frame) where an error occurred.
 * 
 */
public final class StackTraceElementResponse extends com.pulumi.resources.InvokeArgs {

    public static final StackTraceElementResponse Empty = new StackTraceElementResponse();

    /**
     * The source position information of the stack trace element.
     * 
     */
    @Import(name="position", required=true)
    private PositionResponse position;

    /**
     * @return The source position information of the stack trace element.
     * 
     */
    public PositionResponse position() {
        return this.position;
    }

    /**
     * The routine where the error occurred.
     * 
     */
    @Import(name="routine", required=true)
    private String routine;

    /**
     * @return The routine where the error occurred.
     * 
     */
    public String routine() {
        return this.routine;
    }

    /**
     * The step the error occurred at.
     * 
     */
    @Import(name="step", required=true)
    private String step;

    /**
     * @return The step the error occurred at.
     * 
     */
    public String step() {
        return this.step;
    }

    private StackTraceElementResponse() {}

    private StackTraceElementResponse(StackTraceElementResponse $) {
        this.position = $.position;
        this.routine = $.routine;
        this.step = $.step;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackTraceElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackTraceElementResponse $;

        public Builder() {
            $ = new StackTraceElementResponse();
        }

        public Builder(StackTraceElementResponse defaults) {
            $ = new StackTraceElementResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param position The source position information of the stack trace element.
         * 
         * @return builder
         * 
         */
        public Builder position(PositionResponse position) {
            $.position = position;
            return this;
        }

        /**
         * @param routine The routine where the error occurred.
         * 
         * @return builder
         * 
         */
        public Builder routine(String routine) {
            $.routine = routine;
            return this;
        }

        /**
         * @param step The step the error occurred at.
         * 
         * @return builder
         * 
         */
        public Builder step(String step) {
            $.step = step;
            return this;
        }

        public StackTraceElementResponse build() {
            $.position = Objects.requireNonNull($.position, "expected parameter 'position' to be non-null");
            $.routine = Objects.requireNonNull($.routine, "expected parameter 'routine' to be non-null");
            $.step = Objects.requireNonNull($.step, "expected parameter 'step' to be non-null");
            return $;
        }
    }

}
