// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class CrawlerDeltaTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CrawlerDeltaTargetGetArgs Empty = new CrawlerDeltaTargetGetArgs();

    /**
     * The name of the connection to use to connect to the Delta table target.
     * 
     */
    @InputImport(name="connectionName", required=true)
      private final Input<String> connectionName;

    public Input<String> getConnectionName() {
        return this.connectionName;
    }

    /**
     * A list of the Amazon S3 paths to the Delta tables.
     * 
     */
    @InputImport(name="deltaTables", required=true)
      private final Input<List<String>> deltaTables;

    public Input<List<String>> getDeltaTables() {
        return this.deltaTables;
    }

    /**
     * Specifies whether to write the manifest files to the Delta table path.
     * 
     */
    @InputImport(name="writeManifest", required=true)
      private final Input<Boolean> writeManifest;

    public Input<Boolean> getWriteManifest() {
        return this.writeManifest;
    }

    public CrawlerDeltaTargetGetArgs(
        Input<String> connectionName,
        Input<List<String>> deltaTables,
        Input<Boolean> writeManifest) {
        this.connectionName = Objects.requireNonNull(connectionName, "expected parameter 'connectionName' to be non-null");
        this.deltaTables = Objects.requireNonNull(deltaTables, "expected parameter 'deltaTables' to be non-null");
        this.writeManifest = Objects.requireNonNull(writeManifest, "expected parameter 'writeManifest' to be non-null");
    }

    private CrawlerDeltaTargetGetArgs() {
        this.connectionName = Input.empty();
        this.deltaTables = Input.empty();
        this.writeManifest = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerDeltaTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> connectionName;
        private Input<List<String>> deltaTables;
        private Input<Boolean> writeManifest;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerDeltaTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.deltaTables = defaults.deltaTables;
    	      this.writeManifest = defaults.writeManifest;
        }

        public Builder connectionName(Input<String> connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }

        public Builder connectionName(String connectionName) {
            this.connectionName = Input.of(Objects.requireNonNull(connectionName));
            return this;
        }

        public Builder deltaTables(Input<List<String>> deltaTables) {
            this.deltaTables = Objects.requireNonNull(deltaTables);
            return this;
        }

        public Builder deltaTables(List<String> deltaTables) {
            this.deltaTables = Input.of(Objects.requireNonNull(deltaTables));
            return this;
        }

        public Builder writeManifest(Input<Boolean> writeManifest) {
            this.writeManifest = Objects.requireNonNull(writeManifest);
            return this;
        }

        public Builder writeManifest(Boolean writeManifest) {
            this.writeManifest = Input.of(Objects.requireNonNull(writeManifest));
            return this;
        }
        public CrawlerDeltaTargetGetArgs build() {
            return new CrawlerDeltaTargetGetArgs(connectionName, deltaTables, writeManifest);
        }
    }
}
