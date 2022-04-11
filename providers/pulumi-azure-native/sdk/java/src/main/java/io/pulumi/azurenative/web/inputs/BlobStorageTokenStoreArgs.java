// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the storage of the tokens if blob storage is used.
 * 
 */
public final class BlobStorageTokenStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobStorageTokenStoreArgs Empty = new BlobStorageTokenStoreArgs();

    /**
     * The name of the app setting containing the SAS URL of the blob storage containing the tokens.
     * 
     */
    @Import(name="sasUrlSettingName")
      private final @Nullable Output<String> sasUrlSettingName;

    public Output<String> getSasUrlSettingName() {
        return this.sasUrlSettingName == null ? Codegen.empty() : this.sasUrlSettingName;
    }

    public BlobStorageTokenStoreArgs(@Nullable Output<String> sasUrlSettingName) {
        this.sasUrlSettingName = sasUrlSettingName;
    }

    private BlobStorageTokenStoreArgs() {
        this.sasUrlSettingName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobStorageTokenStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> sasUrlSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobStorageTokenStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasUrlSettingName = defaults.sasUrlSettingName;
        }

        public Builder sasUrlSettingName(@Nullable Output<String> sasUrlSettingName) {
            this.sasUrlSettingName = sasUrlSettingName;
            return this;
        }
        public Builder sasUrlSettingName(@Nullable String sasUrlSettingName) {
            this.sasUrlSettingName = Codegen.ofNullable(sasUrlSettingName);
            return this;
        }        public BlobStorageTokenStoreArgs build() {
            return new BlobStorageTokenStoreArgs(sasUrlSettingName);
        }
    }
}
