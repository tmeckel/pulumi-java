// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The data for a matched phrase matcher. Represents information identifying a phrase matcher for a given match.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse Empty = new GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse();

    /**
     * The human-readable name of the phrase matcher.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * The unique identifier (the resource name) of the phrase matcher.
     * 
     */
    @InputImport(name="phraseMatcher", required=true)
      private final String phraseMatcher;

    public String getPhraseMatcher() {
        return this.phraseMatcher;
    }

    public GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse(
        String displayName,
        String phraseMatcher) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.phraseMatcher = Objects.requireNonNull(phraseMatcher, "expected parameter 'phraseMatcher' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse() {
        this.displayName = null;
        this.phraseMatcher = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String phraseMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.phraseMatcher = defaults.phraseMatcher;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder phraseMatcher(String phraseMatcher) {
            this.phraseMatcher = Objects.requireNonNull(phraseMatcher);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse(displayName, phraseMatcher);
        }
    }
}
