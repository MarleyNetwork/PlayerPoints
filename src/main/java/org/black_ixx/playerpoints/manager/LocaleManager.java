package org.black_ixx.playerpoints.manager;

import dev.rosewood.rosegarden.RosePlugin;
import dev.rosewood.rosegarden.locale.Locale;
import dev.rosewood.rosegarden.manager.AbstractLocaleManager;

import java.util.Arrays;
import java.util.List;

import org.black_ixx.playerpoints.locale.EnglishLocale;
import org.black_ixx.playerpoints.locale.FrenchLocale;
import org.black_ixx.playerpoints.locale.HungarianLocale;
import org.black_ixx.playerpoints.locale.JapaneseLocale;
import org.black_ixx.playerpoints.locale.PortugueseLocale;
import org.black_ixx.playerpoints.locale.SimplifiedChineseLocale;
import org.black_ixx.playerpoints.locale.SpanishChileanLocale;
import org.black_ixx.playerpoints.locale.TaiwaneseMandarinLocale;
import org.black_ixx.playerpoints.locale.VietnameseLocale;
import org.bukkit.Bukkit;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.minecart.CommandMinecart;

public class LocaleManager extends AbstractLocaleManager {

    public LocaleManager(RosePlugin rosePlugin) {
        super(rosePlugin);
    }

    @Override
    public List<Locale> getLocales() {
        return Arrays.asList(
                new EnglishLocale(),
                new FrenchLocale(),
                new HungarianLocale(),
                new JapaneseLocale(),
                new PortugueseLocale(),
                new SimplifiedChineseLocale(),
                new TaiwaneseMandarinLocale(),
                new VietnameseLocale(),
                new SpanishChileanLocale()
        );
    }

    public String getCurrencyName(int value) {
        if (value == 1 || value == -1) {
            return this.getLocaleMessage("currency-singular");
        } else {
            return this.getLocaleMessage("currency-plural");
        }
    }

    @Override
    protected void handleMessage(CommandSender sender, String message) {
        if (!Bukkit.isPrimaryThread() && (sender instanceof BlockCommandSender || sender instanceof CommandMinecart)) {
            Bukkit.getScheduler().runTask(this.rosePlugin, () -> super.handleMessage(sender, message));
        } else {
            super.handleMessage(sender, message);
        }
    }

}
