// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.jobs_v3.enums.ProcessingOptionsHtmlSanitization;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input only. Options for job processing.
 * 
 */
public final class ProcessingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProcessingOptionsArgs Empty = new ProcessingOptionsArgs();

    /**
     * Optional. If set to `true`, the service does not attempt to resolve a more precise address for the job.
     * 
     */
    @InputImport(name="disableStreetAddressResolution")
    private final @Nullable Input<Boolean> disableStreetAddressResolution;

    public Input<Boolean> getDisableStreetAddressResolution() {
        return this.disableStreetAddressResolution == null ? Input.empty() : this.disableStreetAddressResolution;
    }

    /**
     * Optional. Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation is not disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
     * 
     */
    @InputImport(name="htmlSanitization")
    private final @Nullable Input<ProcessingOptionsHtmlSanitization> htmlSanitization;

    public Input<ProcessingOptionsHtmlSanitization> getHtmlSanitization() {
        return this.htmlSanitization == null ? Input.empty() : this.htmlSanitization;
    }

    public ProcessingOptionsArgs(
        @Nullable Input<Boolean> disableStreetAddressResolution,
        @Nullable Input<ProcessingOptionsHtmlSanitization> htmlSanitization) {
        this.disableStreetAddressResolution = disableStreetAddressResolution;
        this.htmlSanitization = htmlSanitization;
    }

    private ProcessingOptionsArgs() {
        this.disableStreetAddressResolution = Input.empty();
        this.htmlSanitization = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableStreetAddressResolution;
        private @Nullable Input<ProcessingOptionsHtmlSanitization> htmlSanitization;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableStreetAddressResolution = defaults.disableStreetAddressResolution;
    	      this.htmlSanitization = defaults.htmlSanitization;
        }

        public Builder setDisableStreetAddressResolution(@Nullable Input<Boolean> disableStreetAddressResolution) {
            this.disableStreetAddressResolution = disableStreetAddressResolution;
            return this;
        }

        public Builder setDisableStreetAddressResolution(@Nullable Boolean disableStreetAddressResolution) {
            this.disableStreetAddressResolution = Input.ofNullable(disableStreetAddressResolution);
            return this;
        }

        public Builder setHtmlSanitization(@Nullable Input<ProcessingOptionsHtmlSanitization> htmlSanitization) {
            this.htmlSanitization = htmlSanitization;
            return this;
        }

        public Builder setHtmlSanitization(@Nullable ProcessingOptionsHtmlSanitization htmlSanitization) {
            this.htmlSanitization = Input.ofNullable(htmlSanitization);
            return this;
        }

        public ProcessingOptionsArgs build() {
            return new ProcessingOptionsArgs(disableStreetAddressResolution, htmlSanitization);
        }
    }
}
