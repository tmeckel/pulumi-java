// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.JobInputClipResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Sequence contains an ordered list of Clips where each clip is a JobInput.  The Sequence will be treated as a single input.
 * 
 */
public final class JobInputSequenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobInputSequenceResponse Empty = new JobInputSequenceResponse();

    /**
     * JobInputs that make up the timeline.
     * 
     */
    @Import(name="inputs")
    private @Nullable List<JobInputClipResponse> inputs;

    /**
     * @return JobInputs that make up the timeline.
     * 
     */
    public Optional<List<JobInputClipResponse>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.JobInputSequence&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.JobInputSequence&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    private JobInputSequenceResponse() {}

    private JobInputSequenceResponse(JobInputSequenceResponse $) {
        this.inputs = $.inputs;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobInputSequenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobInputSequenceResponse $;

        public Builder() {
            $ = new JobInputSequenceResponse();
        }

        public Builder(JobInputSequenceResponse defaults) {
            $ = new JobInputSequenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param inputs JobInputs that make up the timeline.
         * 
         * @return builder
         * 
         */
        public Builder inputs(@Nullable List<JobInputClipResponse> inputs) {
            $.inputs = inputs;
            return this;
        }

        /**
         * @param inputs JobInputs that make up the timeline.
         * 
         * @return builder
         * 
         */
        public Builder inputs(JobInputClipResponse... inputs) {
            return inputs(List.of(inputs));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.JobInputSequence&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        public JobInputSequenceResponse build() {
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            return $;
        }
    }

}
