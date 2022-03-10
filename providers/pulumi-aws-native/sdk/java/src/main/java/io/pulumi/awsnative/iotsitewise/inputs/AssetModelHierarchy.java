// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about an asset model hierarchy.
 * 
 */
public final class AssetModelHierarchy extends io.pulumi.resources.InvokeArgs {

    public static final AssetModelHierarchy Empty = new AssetModelHierarchy();

    /**
     * The ID of the asset model. All assets in this hierarchy must be instances of the child AssetModelId asset model.
     * 
     */
    @InputImport(name="childAssetModelId", required=true)
      private final String childAssetModelId;

    public String getChildAssetModelId() {
        return this.childAssetModelId;
    }

    /**
     * Customer provided ID for hierarchy.
     * 
     */
    @InputImport(name="logicalId", required=true)
      private final String logicalId;

    public String getLogicalId() {
        return this.logicalId;
    }

    /**
     * The name of the asset model hierarchy.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public AssetModelHierarchy(
        String childAssetModelId,
        String logicalId,
        String name) {
        this.childAssetModelId = Objects.requireNonNull(childAssetModelId, "expected parameter 'childAssetModelId' to be non-null");
        this.logicalId = Objects.requireNonNull(logicalId, "expected parameter 'logicalId' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private AssetModelHierarchy() {
        this.childAssetModelId = null;
        this.logicalId = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelHierarchy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String childAssetModelId;
        private String logicalId;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelHierarchy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childAssetModelId = defaults.childAssetModelId;
    	      this.logicalId = defaults.logicalId;
    	      this.name = defaults.name;
        }

        public Builder childAssetModelId(String childAssetModelId) {
            this.childAssetModelId = Objects.requireNonNull(childAssetModelId);
            return this;
        }

        public Builder logicalId(String logicalId) {
            this.logicalId = Objects.requireNonNull(logicalId);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public AssetModelHierarchy build() {
            return new AssetModelHierarchy(childAssetModelId, logicalId, name);
        }
    }
}
