// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.awsnative.lex.enums.BotObfuscationSettingObfuscationSettingType;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class BotObfuscationSetting {
    /**
     * @return Value that determines whether Amazon Lex obscures slot values in conversation logs. The default is to obscure the values.
     * 
     */
    private final BotObfuscationSettingObfuscationSettingType obfuscationSettingType;

    @CustomType.Constructor
    private BotObfuscationSetting(@CustomType.Parameter("obfuscationSettingType") BotObfuscationSettingObfuscationSettingType obfuscationSettingType) {
        this.obfuscationSettingType = obfuscationSettingType;
    }

    /**
     * @return Value that determines whether Amazon Lex obscures slot values in conversation logs. The default is to obscure the values.
     * 
     */
    public BotObfuscationSettingObfuscationSettingType obfuscationSettingType() {
        return this.obfuscationSettingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotObfuscationSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotObfuscationSettingObfuscationSettingType obfuscationSettingType;

        public Builder() {
    	      // Empty
        }

        public Builder(BotObfuscationSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.obfuscationSettingType = defaults.obfuscationSettingType;
        }

        public Builder obfuscationSettingType(BotObfuscationSettingObfuscationSettingType obfuscationSettingType) {
            this.obfuscationSettingType = Objects.requireNonNull(obfuscationSettingType);
            return this;
        }        public BotObfuscationSetting build() {
            return new BotObfuscationSetting(obfuscationSettingType);
        }
    }
}
