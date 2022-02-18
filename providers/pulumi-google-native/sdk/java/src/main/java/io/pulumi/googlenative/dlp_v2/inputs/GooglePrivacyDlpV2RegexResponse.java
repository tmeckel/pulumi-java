// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Message defining a custom regular expression.
 * 
 */
public final class GooglePrivacyDlpV2RegexResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2RegexResponse Empty = new GooglePrivacyDlpV2RegexResponse();

    /**
     * The index of the submatch to extract as findings. When not specified, the entire match is returned. No more than 3 may be included.
     * 
     */
    @InputImport(name="groupIndexes", required=true)
    private final List<Integer> groupIndexes;

    public List<Integer> getGroupIndexes() {
        return this.groupIndexes;
    }

    /**
     * Pattern defining the regular expression. Its syntax (https://github.com/google/re2/wiki/Syntax) can be found under the google/re2 repository on GitHub.
     * 
     */
    @InputImport(name="pattern", required=true)
    private final String pattern;

    public String getPattern() {
        return this.pattern;
    }

    public GooglePrivacyDlpV2RegexResponse(
        List<Integer> groupIndexes,
        String pattern) {
        this.groupIndexes = Objects.requireNonNull(groupIndexes, "expected parameter 'groupIndexes' to be non-null");
        this.pattern = Objects.requireNonNull(pattern, "expected parameter 'pattern' to be non-null");
    }

    private GooglePrivacyDlpV2RegexResponse() {
        this.groupIndexes = List.of();
        this.pattern = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RegexResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> groupIndexes;
        private String pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RegexResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIndexes = defaults.groupIndexes;
    	      this.pattern = defaults.pattern;
        }

        public Builder setGroupIndexes(List<Integer> groupIndexes) {
            this.groupIndexes = Objects.requireNonNull(groupIndexes);
            return this;
        }

        public Builder setPattern(String pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }

        public GooglePrivacyDlpV2RegexResponse build() {
            return new GooglePrivacyDlpV2RegexResponse(groupIndexes, pattern);
        }
    }
}
