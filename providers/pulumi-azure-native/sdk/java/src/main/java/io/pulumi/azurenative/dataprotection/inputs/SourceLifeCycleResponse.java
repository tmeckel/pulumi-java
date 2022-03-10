// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.AbsoluteDeleteOptionResponse;
import io.pulumi.azurenative.dataprotection.inputs.DataStoreInfoBaseResponse;
import io.pulumi.azurenative.dataprotection.inputs.TargetCopySettingResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Source LifeCycle
 * 
 */
public final class SourceLifeCycleResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceLifeCycleResponse Empty = new SourceLifeCycleResponse();

    /**
     * Delete Option
     * 
     */
    @InputImport(name="deleteAfter", required=true)
      private final AbsoluteDeleteOptionResponse deleteAfter;

    public AbsoluteDeleteOptionResponse getDeleteAfter() {
        return this.deleteAfter;
    }

    /**
     * DataStoreInfo base
     * 
     */
    @InputImport(name="sourceDataStore", required=true)
      private final DataStoreInfoBaseResponse sourceDataStore;

    public DataStoreInfoBaseResponse getSourceDataStore() {
        return this.sourceDataStore;
    }

    @InputImport(name="targetDataStoreCopySettings")
      private final @Nullable List<TargetCopySettingResponse> targetDataStoreCopySettings;

    public List<TargetCopySettingResponse> getTargetDataStoreCopySettings() {
        return this.targetDataStoreCopySettings == null ? List.of() : this.targetDataStoreCopySettings;
    }

    public SourceLifeCycleResponse(
        AbsoluteDeleteOptionResponse deleteAfter,
        DataStoreInfoBaseResponse sourceDataStore,
        @Nullable List<TargetCopySettingResponse> targetDataStoreCopySettings) {
        this.deleteAfter = Objects.requireNonNull(deleteAfter, "expected parameter 'deleteAfter' to be non-null");
        this.sourceDataStore = Objects.requireNonNull(sourceDataStore, "expected parameter 'sourceDataStore' to be non-null");
        this.targetDataStoreCopySettings = targetDataStoreCopySettings;
    }

    private SourceLifeCycleResponse() {
        this.deleteAfter = null;
        this.sourceDataStore = null;
        this.targetDataStoreCopySettings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceLifeCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AbsoluteDeleteOptionResponse deleteAfter;
        private DataStoreInfoBaseResponse sourceDataStore;
        private @Nullable List<TargetCopySettingResponse> targetDataStoreCopySettings;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceLifeCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteAfter = defaults.deleteAfter;
    	      this.sourceDataStore = defaults.sourceDataStore;
    	      this.targetDataStoreCopySettings = defaults.targetDataStoreCopySettings;
        }

        public Builder deleteAfter(AbsoluteDeleteOptionResponse deleteAfter) {
            this.deleteAfter = Objects.requireNonNull(deleteAfter);
            return this;
        }

        public Builder sourceDataStore(DataStoreInfoBaseResponse sourceDataStore) {
            this.sourceDataStore = Objects.requireNonNull(sourceDataStore);
            return this;
        }

        public Builder targetDataStoreCopySettings(@Nullable List<TargetCopySettingResponse> targetDataStoreCopySettings) {
            this.targetDataStoreCopySettings = targetDataStoreCopySettings;
            return this;
        }
        public SourceLifeCycleResponse build() {
            return new SourceLifeCycleResponse(deleteAfter, sourceDataStore, targetDataStoreCopySettings);
        }
    }
}
