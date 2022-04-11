// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RandomIdState extends io.pulumi.resources.ResourceArgs {

    public static final RandomIdState Empty = new RandomIdState();

    /**
     * The generated id presented in base64 without additional transformations.
     * 
     */
    @Import(name="b64Std")
      private final @Nullable Output<String> b64Std;

    public Output<String> getB64Std() {
        return this.b64Std == null ? Codegen.empty() : this.b64Std;
    }

    /**
     * The generated id presented in base64, using the URL-friendly character set: case-sensitive letters, digits and the characters `_` and `-`.
     * 
     */
    @Import(name="b64Url")
      private final @Nullable Output<String> b64Url;

    public Output<String> getB64Url() {
        return this.b64Url == null ? Codegen.empty() : this.b64Url;
    }

    /**
     * The number of random bytes to produce. The minimum value is 1, which produces eight bits of randomness.
     * 
     */
    @Import(name="byteLength")
      private final @Nullable Output<Integer> byteLength;

    public Output<Integer> getByteLength() {
        return this.byteLength == null ? Codegen.empty() : this.byteLength;
    }

    /**
     * The generated id presented in non-padded decimal digits.
     * 
     */
    @Import(name="dec")
      private final @Nullable Output<String> dec;

    public Output<String> getDec() {
        return this.dec == null ? Codegen.empty() : this.dec;
    }

    /**
     * The generated id presented in padded hexadecimal digits. This result will always be twice as long as the requested byte length.
     * 
     */
    @Import(name="hex")
      private final @Nullable Output<String> hex;

    public Output<String> getHex() {
        return this.hex == null ? Codegen.empty() : this.hex;
    }

    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @Import(name="keepers")
      private final @Nullable Output<Map<String,Object>> keepers;

    public Output<Map<String,Object>> getKeepers() {
        return this.keepers == null ? Codegen.empty() : this.keepers;
    }

    /**
     * Arbitrary string to prefix the output value with. This string is supplied as-is, meaning it is not guaranteed to be URL-safe or base64 encoded.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Codegen.empty() : this.prefix;
    }

    public RandomIdState(
        @Nullable Output<String> b64Std,
        @Nullable Output<String> b64Url,
        @Nullable Output<Integer> byteLength,
        @Nullable Output<String> dec,
        @Nullable Output<String> hex,
        @Nullable Output<Map<String,Object>> keepers,
        @Nullable Output<String> prefix) {
        this.b64Std = b64Std;
        this.b64Url = b64Url;
        this.byteLength = byteLength;
        this.dec = dec;
        this.hex = hex;
        this.keepers = keepers;
        this.prefix = prefix;
    }

    private RandomIdState() {
        this.b64Std = Codegen.empty();
        this.b64Url = Codegen.empty();
        this.byteLength = Codegen.empty();
        this.dec = Codegen.empty();
        this.hex = Codegen.empty();
        this.keepers = Codegen.empty();
        this.prefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RandomIdState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> b64Std;
        private @Nullable Output<String> b64Url;
        private @Nullable Output<Integer> byteLength;
        private @Nullable Output<String> dec;
        private @Nullable Output<String> hex;
        private @Nullable Output<Map<String,Object>> keepers;
        private @Nullable Output<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(RandomIdState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.b64Std = defaults.b64Std;
    	      this.b64Url = defaults.b64Url;
    	      this.byteLength = defaults.byteLength;
    	      this.dec = defaults.dec;
    	      this.hex = defaults.hex;
    	      this.keepers = defaults.keepers;
    	      this.prefix = defaults.prefix;
        }

        public Builder b64Std(@Nullable Output<String> b64Std) {
            this.b64Std = b64Std;
            return this;
        }
        public Builder b64Std(@Nullable String b64Std) {
            this.b64Std = Codegen.ofNullable(b64Std);
            return this;
        }
        public Builder b64Url(@Nullable Output<String> b64Url) {
            this.b64Url = b64Url;
            return this;
        }
        public Builder b64Url(@Nullable String b64Url) {
            this.b64Url = Codegen.ofNullable(b64Url);
            return this;
        }
        public Builder byteLength(@Nullable Output<Integer> byteLength) {
            this.byteLength = byteLength;
            return this;
        }
        public Builder byteLength(@Nullable Integer byteLength) {
            this.byteLength = Codegen.ofNullable(byteLength);
            return this;
        }
        public Builder dec(@Nullable Output<String> dec) {
            this.dec = dec;
            return this;
        }
        public Builder dec(@Nullable String dec) {
            this.dec = Codegen.ofNullable(dec);
            return this;
        }
        public Builder hex(@Nullable Output<String> hex) {
            this.hex = hex;
            return this;
        }
        public Builder hex(@Nullable String hex) {
            this.hex = Codegen.ofNullable(hex);
            return this;
        }
        public Builder keepers(@Nullable Output<Map<String,Object>> keepers) {
            this.keepers = keepers;
            return this;
        }
        public Builder keepers(@Nullable Map<String,Object> keepers) {
            this.keepers = Codegen.ofNullable(keepers);
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Codegen.ofNullable(prefix);
            return this;
        }        public RandomIdState build() {
            return new RandomIdState(b64Std, b64Url, byteLength, dec, hex, keepers, prefix);
        }
    }
}
