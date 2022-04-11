// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.CloudSqlSettingsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies required connection parameters, and, optionally, the parameters required to create a Cloud SQL destination database instance.
 * 
 */
public final class CloudSqlConnectionProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudSqlConnectionProfileArgs Empty = new CloudSqlConnectionProfileArgs();

    /**
     * Immutable. Metadata used to create the destination Cloud SQL database.
     * 
     */
    @Import(name="settings")
      private final @Nullable Output<CloudSqlSettingsArgs> settings;

    public Output<CloudSqlSettingsArgs> getSettings() {
        return this.settings == null ? Codegen.empty() : this.settings;
    }

    public CloudSqlConnectionProfileArgs(@Nullable Output<CloudSqlSettingsArgs> settings) {
        this.settings = settings;
    }

    private CloudSqlConnectionProfileArgs() {
        this.settings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSqlConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CloudSqlSettingsArgs> settings;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSqlConnectionProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.settings = defaults.settings;
        }

        public Builder settings(@Nullable Output<CloudSqlSettingsArgs> settings) {
            this.settings = settings;
            return this;
        }
        public Builder settings(@Nullable CloudSqlSettingsArgs settings) {
            this.settings = Codegen.ofNullable(settings);
            return this;
        }        public CloudSqlConnectionProfileArgs build() {
            return new CloudSqlConnectionProfileArgs(settings);
        }
    }
}
