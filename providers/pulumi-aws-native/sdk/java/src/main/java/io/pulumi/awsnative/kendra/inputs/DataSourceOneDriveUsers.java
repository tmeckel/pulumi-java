// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceS3Path;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceOneDriveUsers extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceOneDriveUsers Empty = new DataSourceOneDriveUsers();

    @InputImport(name="oneDriveUserList")
      private final @Nullable List<String> oneDriveUserList;

    public List<String> getOneDriveUserList() {
        return this.oneDriveUserList == null ? List.of() : this.oneDriveUserList;
    }

    @InputImport(name="oneDriveUserS3Path")
      private final @Nullable DataSourceS3Path oneDriveUserS3Path;

    public Optional<DataSourceS3Path> getOneDriveUserS3Path() {
        return this.oneDriveUserS3Path == null ? Optional.empty() : Optional.ofNullable(this.oneDriveUserS3Path);
    }

    public DataSourceOneDriveUsers(
        @Nullable List<String> oneDriveUserList,
        @Nullable DataSourceS3Path oneDriveUserS3Path) {
        this.oneDriveUserList = oneDriveUserList;
        this.oneDriveUserS3Path = oneDriveUserS3Path;
    }

    private DataSourceOneDriveUsers() {
        this.oneDriveUserList = List.of();
        this.oneDriveUserS3Path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceOneDriveUsers defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> oneDriveUserList;
        private @Nullable DataSourceS3Path oneDriveUserS3Path;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceOneDriveUsers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oneDriveUserList = defaults.oneDriveUserList;
    	      this.oneDriveUserS3Path = defaults.oneDriveUserS3Path;
        }

        public Builder oneDriveUserList(@Nullable List<String> oneDriveUserList) {
            this.oneDriveUserList = oneDriveUserList;
            return this;
        }

        public Builder oneDriveUserS3Path(@Nullable DataSourceS3Path oneDriveUserS3Path) {
            this.oneDriveUserS3Path = oneDriveUserS3Path;
            return this;
        }
        public DataSourceOneDriveUsers build() {
            return new DataSourceOneDriveUsers(oneDriveUserList, oneDriveUserS3Path);
        }
    }
}
