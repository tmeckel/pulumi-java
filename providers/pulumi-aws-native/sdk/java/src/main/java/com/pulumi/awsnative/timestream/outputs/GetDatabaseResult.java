// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.timestream.outputs;

import com.pulumi.awsnative.timestream.outputs.DatabaseTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatabaseResult {
    private final @Nullable String arn;
    /**
     * @return The KMS key for the database. If the KMS key is not specified, the database will be encrypted with a Timestream managed KMS key located in your account.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<DatabaseTag> tags;

    @CustomType.Constructor
    private GetDatabaseResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("tags") @Nullable List<DatabaseTag> tags) {
        this.arn = arn;
        this.kmsKeyId = kmsKeyId;
        this.tags = tags;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The KMS key for the database. If the KMS key is not specified, the database will be encrypted with a Timestream managed KMS key located in your account.
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public List<DatabaseTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String kmsKeyId;
        private @Nullable List<DatabaseTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder tags(@Nullable List<DatabaseTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DatabaseTag... tags) {
            return tags(List.of(tags));
        }        public GetDatabaseResult build() {
            return new GetDatabaseResult(arn, kmsKeyId, tags);
        }
    }
}
