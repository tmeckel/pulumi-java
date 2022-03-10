// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLPositionalConstraint;
import io.pulumi.awsnative.wafv2.inputs.WebACLFieldToMatchArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Byte Match statement.
 * 
 */
public final class WebACLByteMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLByteMatchStatementArgs Empty = new WebACLByteMatchStatementArgs();

    @InputImport(name="fieldToMatch", required=true)
      private final Input<WebACLFieldToMatchArgs> fieldToMatch;

    public Input<WebACLFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    @InputImport(name="positionalConstraint", required=true)
      private final Input<WebACLPositionalConstraint> positionalConstraint;

    public Input<WebACLPositionalConstraint> getPositionalConstraint() {
        return this.positionalConstraint;
    }

    @InputImport(name="searchString")
      private final @Nullable Input<String> searchString;

    public Input<String> getSearchString() {
        return this.searchString == null ? Input.empty() : this.searchString;
    }

    @InputImport(name="searchStringBase64")
      private final @Nullable Input<String> searchStringBase64;

    public Input<String> getSearchStringBase64() {
        return this.searchStringBase64 == null ? Input.empty() : this.searchStringBase64;
    }

    @InputImport(name="textTransformations", required=true)
      private final Input<List<WebACLTextTransformationArgs>> textTransformations;

    public Input<List<WebACLTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebACLByteMatchStatementArgs(
        Input<WebACLFieldToMatchArgs> fieldToMatch,
        Input<WebACLPositionalConstraint> positionalConstraint,
        @Nullable Input<String> searchString,
        @Nullable Input<String> searchStringBase64,
        Input<List<WebACLTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.positionalConstraint = Objects.requireNonNull(positionalConstraint, "expected parameter 'positionalConstraint' to be non-null");
        this.searchString = searchString;
        this.searchStringBase64 = searchStringBase64;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebACLByteMatchStatementArgs() {
        this.fieldToMatch = Input.empty();
        this.positionalConstraint = Input.empty();
        this.searchString = Input.empty();
        this.searchStringBase64 = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLByteMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<WebACLFieldToMatchArgs> fieldToMatch;
        private Input<WebACLPositionalConstraint> positionalConstraint;
        private @Nullable Input<String> searchString;
        private @Nullable Input<String> searchStringBase64;
        private Input<List<WebACLTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLByteMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.positionalConstraint = defaults.positionalConstraint;
    	      this.searchString = defaults.searchString;
    	      this.searchStringBase64 = defaults.searchStringBase64;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(Input<WebACLFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder fieldToMatch(WebACLFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder positionalConstraint(Input<WebACLPositionalConstraint> positionalConstraint) {
            this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
            return this;
        }

        public Builder positionalConstraint(WebACLPositionalConstraint positionalConstraint) {
            this.positionalConstraint = Input.of(Objects.requireNonNull(positionalConstraint));
            return this;
        }

        public Builder searchString(@Nullable Input<String> searchString) {
            this.searchString = searchString;
            return this;
        }

        public Builder searchString(@Nullable String searchString) {
            this.searchString = Input.ofNullable(searchString);
            return this;
        }

        public Builder searchStringBase64(@Nullable Input<String> searchStringBase64) {
            this.searchStringBase64 = searchStringBase64;
            return this;
        }

        public Builder searchStringBase64(@Nullable String searchStringBase64) {
            this.searchStringBase64 = Input.ofNullable(searchStringBase64);
            return this;
        }

        public Builder textTransformations(Input<List<WebACLTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<WebACLTextTransformationArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebACLByteMatchStatementArgs build() {
            return new WebACLByteMatchStatementArgs(fieldToMatch, positionalConstraint, searchString, searchStringBase64, textTransformations);
        }
    }
}
