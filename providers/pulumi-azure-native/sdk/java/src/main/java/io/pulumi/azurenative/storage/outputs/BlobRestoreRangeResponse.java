// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BlobRestoreRangeResponse {
    /**
     * Blob end range. This is exclusive. Empty means account end.
     * 
     */
    private final String endRange;
    /**
     * Blob start range. This is inclusive. Empty means account start.
     * 
     */
    private final String startRange;

    @OutputCustomType.Constructor
    private BlobRestoreRangeResponse(
        @OutputCustomType.Parameter("endRange") String endRange,
        @OutputCustomType.Parameter("startRange") String startRange) {
        this.endRange = endRange;
        this.startRange = startRange;
    }

    /**
     * Blob end range. This is exclusive. Empty means account end.
     * 
    */
    public String getEndRange() {
        return this.endRange;
    }
    /**
     * Blob start range. This is inclusive. Empty means account start.
     * 
    */
    public String getStartRange() {
        return this.startRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobRestoreRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endRange;
        private String startRange;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobRestoreRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endRange = defaults.endRange;
    	      this.startRange = defaults.startRange;
        }

        public Builder endRange(String endRange) {
            this.endRange = Objects.requireNonNull(endRange);
            return this;
        }

        public Builder startRange(String startRange) {
            this.startRange = Objects.requireNonNull(startRange);
            return this;
        }
        public BlobRestoreRangeResponse build() {
            return new BlobRestoreRangeResponse(endRange, startRange);
        }
    }
}
