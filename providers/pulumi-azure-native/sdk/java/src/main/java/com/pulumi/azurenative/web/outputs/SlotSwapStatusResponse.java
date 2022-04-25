// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SlotSwapStatusResponse {
    /**
     * @return The destination slot of the last swap operation.
     * 
     */
    private final String destinationSlotName;
    /**
     * @return The source slot of the last swap operation.
     * 
     */
    private final String sourceSlotName;
    /**
     * @return The time the last successful slot swap completed.
     * 
     */
    private final String timestampUtc;

    @CustomType.Constructor
    private SlotSwapStatusResponse(
        @CustomType.Parameter("destinationSlotName") String destinationSlotName,
        @CustomType.Parameter("sourceSlotName") String sourceSlotName,
        @CustomType.Parameter("timestampUtc") String timestampUtc) {
        this.destinationSlotName = destinationSlotName;
        this.sourceSlotName = sourceSlotName;
        this.timestampUtc = timestampUtc;
    }

    /**
     * @return The destination slot of the last swap operation.
     * 
     */
    public String destinationSlotName() {
        return this.destinationSlotName;
    }
    /**
     * @return The source slot of the last swap operation.
     * 
     */
    public String sourceSlotName() {
        return this.sourceSlotName;
    }
    /**
     * @return The time the last successful slot swap completed.
     * 
     */
    public String timestampUtc() {
        return this.timestampUtc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlotSwapStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationSlotName;
        private String sourceSlotName;
        private String timestampUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(SlotSwapStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationSlotName = defaults.destinationSlotName;
    	      this.sourceSlotName = defaults.sourceSlotName;
    	      this.timestampUtc = defaults.timestampUtc;
        }

        public Builder destinationSlotName(String destinationSlotName) {
            this.destinationSlotName = Objects.requireNonNull(destinationSlotName);
            return this;
        }
        public Builder sourceSlotName(String sourceSlotName) {
            this.sourceSlotName = Objects.requireNonNull(sourceSlotName);
            return this;
        }
        public Builder timestampUtc(String timestampUtc) {
            this.timestampUtc = Objects.requireNonNull(timestampUtc);
            return this;
        }        public SlotSwapStatusResponse build() {
            return new SlotSwapStatusResponse(destinationSlotName, sourceSlotName, timestampUtc);
        }
    }
}
