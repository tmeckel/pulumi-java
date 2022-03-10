// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CharsToIgnoreResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Partially mask a string by replacing a given number of characters with a fixed character. Masking can start from the beginning or end of the string. This can be used on data of any type (numbers, longs, and so on) and when de-identifying structured data we'll attempt to preserve the original data's type. (This allows you to take a long like 123 and modify it to a string like **3.
 * 
 */
public final class GooglePrivacyDlpV2CharacterMaskConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2CharacterMaskConfigResponse Empty = new GooglePrivacyDlpV2CharacterMaskConfigResponse();

    /**
     * When masking a string, items in this list will be skipped when replacing characters. For example, if the input string is `555-555-5555` and you instruct Cloud DLP to skip `-` and mask 5 characters with `*`, Cloud DLP returns `***-**5-5555`.
     * 
     */
    @InputImport(name="charactersToIgnore", required=true)
      private final List<GooglePrivacyDlpV2CharsToIgnoreResponse> charactersToIgnore;

    public List<GooglePrivacyDlpV2CharsToIgnoreResponse> getCharactersToIgnore() {
        return this.charactersToIgnore;
    }

    /**
     * Character to use to mask the sensitive values—for example, `*` for an alphabetic string such as a name, or `0` for a numeric string such as ZIP code or credit card number. This string must have a length of 1. If not supplied, this value defaults to `*` for strings, and `0` for digits.
     * 
     */
    @InputImport(name="maskingCharacter", required=true)
      private final String maskingCharacter;

    public String getMaskingCharacter() {
        return this.maskingCharacter;
    }

    /**
     * Number of characters to mask. If not set, all matching chars will be masked. Skipped characters do not count towards this tally.
     * 
     */
    @InputImport(name="numberToMask", required=true)
      private final Integer numberToMask;

    public Integer getNumberToMask() {
        return this.numberToMask;
    }

    /**
     * Mask characters in reverse order. For example, if `masking_character` is `0`, `number_to_mask` is `14`, and `reverse_order` is `false`, then the input string `1234-5678-9012-3456` is masked as `00000000000000-3456`. If `masking_character` is `*`, `number_to_mask` is `3`, and `reverse_order` is `true`, then the string `12345` is masked as `12***`.
     * 
     */
    @InputImport(name="reverseOrder", required=true)
      private final Boolean reverseOrder;

    public Boolean getReverseOrder() {
        return this.reverseOrder;
    }

    public GooglePrivacyDlpV2CharacterMaskConfigResponse(
        List<GooglePrivacyDlpV2CharsToIgnoreResponse> charactersToIgnore,
        String maskingCharacter,
        Integer numberToMask,
        Boolean reverseOrder) {
        this.charactersToIgnore = Objects.requireNonNull(charactersToIgnore, "expected parameter 'charactersToIgnore' to be non-null");
        this.maskingCharacter = Objects.requireNonNull(maskingCharacter, "expected parameter 'maskingCharacter' to be non-null");
        this.numberToMask = Objects.requireNonNull(numberToMask, "expected parameter 'numberToMask' to be non-null");
        this.reverseOrder = Objects.requireNonNull(reverseOrder, "expected parameter 'reverseOrder' to be non-null");
    }

    private GooglePrivacyDlpV2CharacterMaskConfigResponse() {
        this.charactersToIgnore = List.of();
        this.maskingCharacter = null;
        this.numberToMask = null;
        this.reverseOrder = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CharacterMaskConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2CharsToIgnoreResponse> charactersToIgnore;
        private String maskingCharacter;
        private Integer numberToMask;
        private Boolean reverseOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CharacterMaskConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charactersToIgnore = defaults.charactersToIgnore;
    	      this.maskingCharacter = defaults.maskingCharacter;
    	      this.numberToMask = defaults.numberToMask;
    	      this.reverseOrder = defaults.reverseOrder;
        }

        public Builder charactersToIgnore(List<GooglePrivacyDlpV2CharsToIgnoreResponse> charactersToIgnore) {
            this.charactersToIgnore = Objects.requireNonNull(charactersToIgnore);
            return this;
        }

        public Builder maskingCharacter(String maskingCharacter) {
            this.maskingCharacter = Objects.requireNonNull(maskingCharacter);
            return this;
        }

        public Builder numberToMask(Integer numberToMask) {
            this.numberToMask = Objects.requireNonNull(numberToMask);
            return this;
        }

        public Builder reverseOrder(Boolean reverseOrder) {
            this.reverseOrder = Objects.requireNonNull(reverseOrder);
            return this;
        }
        public GooglePrivacyDlpV2CharacterMaskConfigResponse build() {
            return new GooglePrivacyDlpV2CharacterMaskConfigResponse(charactersToIgnore, maskingCharacter, numberToMask, reverseOrder);
        }
    }
}
